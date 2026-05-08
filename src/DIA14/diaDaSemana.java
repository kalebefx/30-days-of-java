package DIA14;

import java.util.Scanner;

public class diaDaSemana {

    public enum diaSemana {
        SEGUNDA("Útil"),
        TERCA("Útil"),
        QUARTA("Útil"),
        QUINTA("Útil"),
        SEXTA("Útil"),
        SABADO("Final de semana"),
        DOMINGO("Final de semana");

        private String tipo;

        diaSemana(String tipo) {
            this.tipo = tipo;
        }

        public String getTipo() {
            return tipo;
        }
    }


}
