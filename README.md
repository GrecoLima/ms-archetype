# Uso 

mvn archetype:generate -DgroupId=${groupId} -DartifactId=${artifactId} -Ddomain=${domain} -Dinput=${input} -DarchetypeGroupId=br.com.greco -DarchetypeArtifactId=ms-archetype -DarchetypeVersion=1.0-SNAPSHOT -DinteractiveMode=false

#####Onde:
* ${groupId} - GroupId do microsserviço a ser gerado (exemplo: br.com.corpambiental)
* ${artifactId} - Nome do artefato a ser gerado (exemplo: ms-leitura)
* ${domain} - Nome do domínio de negócio (exemplo: medicao)
* ${input} - Nome da entidade de entrada (exemplo: Leitura)

#####Exemplo:

mvn archetype:generate -DgroupId=br.com.greco -DartifactId=ms-cavalete -Ddomain=springTest -Dinput=Teste -DarchetypeGroupId=br.com.greco -DarchetypeArtifactId=ms-archetype -DarchetypeVersion=1.0-SNAPSHOT -DinteractiveMode=false