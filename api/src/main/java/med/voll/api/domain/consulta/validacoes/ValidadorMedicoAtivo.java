package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.DadosAgendamentoColsuta;
import med.voll.api.domain.medico.MedicoRepository;

public class ValidadorMedicoAtivo {


    private MedicoRepository repository;

    public void validar(DadosAgendamentoColsuta dados){
        if (dados.idMedico() == null){
            return;
        }

        var medicoEstaAtivo = repository.findAtivoById(dados.idMedico());

        if (!medicoEstaAtivo) {
            throw new ValidacaoException("Consulta não pode ser agendada com medico excluido");
        }


    }
}
