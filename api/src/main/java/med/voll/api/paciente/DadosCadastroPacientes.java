package med.voll.api.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEndereco;
import org.hibernate.validator.constraints.br.CPF;

public record DadosCadastroPacientes(
        @NotBlank
        String nome,
        @NotBlank
        String email,
        String telefone,
        @NotBlank
        @CPF
        String cpf,

        @NotNull
        @Valid
        DadosEndereco endereco) {
}
