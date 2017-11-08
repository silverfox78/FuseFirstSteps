# Fuse First Steps

---

Esta es una reseña personal de como afrontar los primeros pasos en Fuse y la exposicion y consumo de servicios.

---

## Requerimientos

Dispondremos de una MV para realizar nuestro trabajo, en este caso dispondre de linux con una distribucion de **Ubuntu 16.04 LTS**.

En ella, requerimos tener algunas cosas basicas como:

* **JDK de Java**, en mi caso la version **1.8**
* **SoapUI y Postman** para probar y levantar servicios
* Algun **navegador web** de su gusto para ver lo que se esta haciendo
* Alguna herramienta de edicion de texto y codigo, en mi caso optare por **Visual Code**

Tambien necesitamos algunas cosas mas especificas como:

* Apache CXF : Version 3.2 **[URL](http://www.apache.org/dyn/closer.lua/cxf/3.2.0/apache-cxf-3.2.0.zip)**

# En Ubuntu
    ./wsdl2java -p ejemplo.servicio -d /home/vida/CXF_Salida -client -exsh false -dns true -dex true -verbose http://localhost:1234/mockServicioPrueba?WSDL
    sudo apt-get update
    sudo apt-get upgrade
    sudo apt-get dist-upgrade
    sudo apt-get install update-manager-core
    sudo do-release-upgrade
    sudo adduser [Su_USUARIO] vboxsf
    sudo apt-get install --no-install-recommends gnome-panel
    sudo apt-get install curl


# POSTMAN
    wget https://dl.pstmn.io/download/latest/linux64 -O postman.tar.gz
    sudo tar -xzf postman.tar.gz -C /opt
    rm postman.tar.gz
    sudo ln -s /opt/Postman/Postman /usr/bin/postman

    LINK POSTMAN
    cat > ~/.local/share/applications/postman.desktop <<EOL
    [Desktop Entry]
    Encoding=UTF-8
    Name=Postman
    Exec=postman
    Icon=/opt/Postman/resources/app/assets/icon.png
    Terminal=false
    Type=Application
    Categories=Development;
    EOL

# JAVA8
    sudo add-apt-repository ppa:webupd8team/java
    sudo apt-get update
    sudo apt-get install oracle-java8-installer

    Verificando...
    java -version 

    SUDO NANO /etc/environment
    JAVA_HOME=/usr/lib/jvm/java-8-oracle
    JRE_HOME=/usr/lib/jvm/java-8-oracle/jre

    SUDO NANO /etc/profile
    export JAVA_HOME=/usr/lib/jvm/java-8-oracle
    export JRE_HOME=/usr/lib/jvm/java-8-oracle/jre
    export PATH=$JAVA_HOME/bin:$PATH

    Verificamos...
    echo $JAVA_HOME

# SOAP UI
    Bajar e instalar desde la web
    Unico detalle con el SH que se baje

    sudo chmod +x SoapUi.X.X.X.sh
    ./SoapUi.X.X.X.sh

# GIT

```{r, engine='sh', count_lines}
    sudo apt-get update
    sudo apt-get install git
    sudo apt-get update
```

# Node

```{r, engine='sh', count_lines}
    sudo apt-get install nodejs
    sudo apt-get install npm
    curl -sL https://deb.nodesource.com/setup_6.x -o nodesource_setup.sh
    sudo bash nodesource_setup.sh
    sudo apt-get install nodejs
    sudo apt-get install build-essential
    sudo apt-get update
    sudo apt-get install build-essential libssl-dev
    curl -sL https://raw.githubusercontent.com/creationix/nvm/v0.31.0/install.sh -o install_nvm.sh
    bash install_nvm.sh
    source ~/.profile
    nvm ls-remote
    nvm install 6.0.0
    nvm use 6.0.0
    node -v
    npm install express
    npm install -g express
    npm link express
```

# Python

```{r, engine='sh', count_lines}
    sudo apt-get update
    sudo apt-get -y upgrade
    python3 -V
    sudo apt-get install -y python3-pip
    pip install --upgrade pip
    pip3 install django
    pip3 install numpy
    sudo apt-get install build-essential libssl-dev libffi-dev python-dev
    sudo apt-get install -y python3-venv
```

# Eclipse - Oxigen

Descargamos Eclipse: http://www.eclipse.org/
Lo descomprimimos e instalamos.

```{r, engine='sh', count_lines}

    /home/[USUARIO]/eclipse/java-oxygen2

```

Luego para comodidad, generamos un lanzador

```{r, engine='sh', count_lines}

    sudo gedit /usr/share/applications/eclipse.desktop

    [Desktop Entry]
    Name=Eclipse
    Type=Application
    Exec=/home/vida/eclipse/java-oxygen2/eclipse/eclipse
    Terminal=false
    Icon=/home/vida/eclipse/java-oxygen2/eclipse/icon.xpm
    Comment=Integrated Development Environment
    NoDisplay=false
    Categories=Development;IDE;
    Name[en]=Eclipse

```

# Karaf - Fuse

## Configuracion de KARAF

```{r, engine='sh', count_lines}
    sudo gedit /home/[USUARIO]/Karaf/etc/system.properties
```

Modificamos la linea del nombre de la instancia
karaf.name = [NOMBRE_INSTANCIA_FABRIC]

```{r, engine='sh', count_lines}
    sudo gedit /home/[USUARIO]/Karaf/etc/users.properties
```

Descomentamos la linea del administrador
admin=admin,admin,manager,viewer,Monitor, Operator, Maintainer, Deployer, Auditor, Administrator, SuperUser

---

## Lanzador de KARAF

**Lanzador de la APP**

```{r, engine='sh', count_lines}
sudo gedit /usr/share/applications/karaf.desktop
```

**Texto para el Lanzador**

Observacion: El icono lo deben bajar ustedes...

```{r, engine='sh', count_lines}

[Desktop Entry]
Name=Karaf
Comment=Consola de Karaf-Fuse
Exec=/home/[USUARIO]/Karaf/bin/karaf
Icon=/home/[USUARIO]/Karaf/bin/karaf.png
Terminal=true
Type=Application

```

---

## Configuracion de Fabric

Iniciamo con la configuracion de los datos de la instancia de Fabric, usaremos el usuario **[admin]**

```{r, engine='sh', count_lines}

    fabric:create --new-user [USUARIO] --new-user-password [CONTRASEÑA_USUARIO] --new-user-role Administrator --resolver localhostname --zookeeper-password [CONTRASEÑA_ZOOKEEPER] --wait-for-provisioning --force --clean

```

Proseguimos con la generacion del contenedor, el cual sera nuestro **Contenedor**.

```{r, engine='sh', count_lines}

    fabric:container-create-child [NOMBRE_INSTANCIA_FABRIC] [NOMBRE_CONTENEDOR]

```

**OBSERVACION:** En caso de problemas en el nombre del equipo, usar el siguiente comando:


´´´

    fabric:container-resolver-set --container <NOMBRE_NODO/CONTENEDOR> localip

´´´

Lo que prosigue, es la creacion de un perfil, para nuestros fines, pensamos en lo siguiente:

Asignaremos como padre: **feature-camel**.

Y le agregaremos los siguientes features:
* camel-core
* camel-cxf
* camel-spring
* camel-blueprint
* camel-restlet
* camel-jackson
* camel-jacksonxml
* camel-jaxb
* camel-jetty
* fabric-camel
* spring

Para la creacion usaremos el comando:

´´´{r, engine='sh', count_lines}

    fabric:profile-create --parents feature-camel [NOMBRE_PERFIL]

´´´

Para la agregar los **features** usaremos el comando:

´´´{r, engine='sh', count_lines}

    fabric:profile-edit --features camel-core --features camel-cxf --features camel-spring --features camel-blueprint --features camel-restlet --features camel-jackson --features camel-jacksonxml --features camel-jaxb --features camel-jetty --features fabric-camel --features spring [NOMBRE_PERFIL]

´´´

Lo siguiente, es crear asociar a nuestro **Contenedor** el perfil creado...

´´´

    fabric:container-add-profile [NOMBRE_CONTENEDOR] [NOMBRE_PERFIL]

´´´


