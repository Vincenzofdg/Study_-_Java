1. Baixar o tar.gz no pelo [link](https://dlcdn.apache.org/maven/maven-3/3.8.5/binaries/apache-maven-3.8.5-bin.tar.gz);
2. Copie o texto no arquivo _.profile_ (_./home/$USER/.profile_):
```sh
JAVA_HOME=/usr/lib/jvm/java-1.11.0-openjdk-amd64
export JAVA_HOME
PATH=$JAVA_HOME/bin:$PATH
export PATH
```
  - Dependendo da versão instalada o JAVA_HOME mudara (_java-1.11.0-openjdk-amd64_);

3. Reinicie e veja se quando executar `echo $JAVA_HOME` terá o retorno _/usr/lib/jvm/java-1.11.0-openjdk-amd64_;
4. Extraia e copie os arquivos para _/opt/_
   - `sudo tar xzvf maven.tar.gz -C /opt/`

5. Adicione no arquivo _.profile_;
```sh
MAVEN_HOME=/opt/apache-maven-3.8.5
export MAVEN_HOME
```

Resultado final do _.profile_:
```sh
JAVA_HOME=/usr/lib/jvm/java-1.11.0-openjdk-amd64
export JAVA_HOME
MAVEN_HOME=/opt/apache-maven-3.8.5
export MAVEN_HOME
PATH=$JAVA_HOME/bin:$MAVEN_HOME/bin:$PATH
export PATH
```

6. Reinicie novamente e verifique:
   - `echo $JAVA_HOME` retorna _/usr/lib/jvm/java-1.11.0-openjdk-amd64_;
   - `echo $MAVEN_HOME` retorna _/opt/apache-maven-3.8.5_;
