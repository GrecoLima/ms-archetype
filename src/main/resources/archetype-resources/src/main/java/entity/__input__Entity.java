#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.entity;

import javax.persistence.*;

@Entity
@Table(schema = "${domain}", name = "${input}")
public class ${input}Entity {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_${input}")
    private Integer id;
//    TODO: Insira aqui os atributos da entidade

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
