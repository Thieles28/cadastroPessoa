package app.com.cadastro.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_cadastro")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @NotBlank(message = "O nome é obrigatorio")
    @Size(min=3, max=100, message = "O nome deve ter pelo menos 2 caracteres ")
    @Column(name = "nome")
    private String nome;

    @Column(name = "sexo")
    private char sexo;

    @Email
    @Column(name = "email")
    private String email;
    
    @NotNull(message = "A data de nascimento não pode ser nula")
    @JsonFormat(pattern="dd/MM/yyyy")
    @Column(name = "data")
    private LocalDate dataNascimento;

    @ManyToOne
    @JoinColumn(name = "cod_pais")
    private Nacionalidade nacionalidade;

    @ManyToOne
    @JoinColumn(name = "cod_estado")
    private Naturalidade naturalidade;

    @CPF
    @NotBlank(message = "Cpf é obrigatorio")
    @Column(name = "cpf")
    private String cpf;
}
