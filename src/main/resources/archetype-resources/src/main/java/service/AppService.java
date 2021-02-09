#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import ${package}.vo.${input}VO;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class AppService {
    private static Logger LOGGER = LoggerFactory.getLogger(AppService.class);

    public String execute(${input}VO input) {
        LOGGER.info("Inicio da execucao do servico");
//        TODO: Insira aqui as regras de negocio do microsservico
        LOGGER.info("Fim da execucao do servico");

        return null;
    }
}
