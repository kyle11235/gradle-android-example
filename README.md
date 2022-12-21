


- from

        https://github.com/jfrog/project-examples/tree/master/gradle-examples/gradle-android-example

- install

        wget https://services.gradle.org/distributions/gradle-6.8.2-bin.zip
        unzip gradle-6.8.2-bin.zip
        sudo mv gradle-6.8.2 /opt/gradle-6.8.2
        sudo vi /etc/profile
        export PATH=$PATH:/opt/gradle-6.8.2/bin
        source /etc/profile

- config

        check build.gradle

- test

        vi build.gradle
        vi gradle.properties -> set user/password in 

        gradle clean build
        gradle artifactoryPublish

