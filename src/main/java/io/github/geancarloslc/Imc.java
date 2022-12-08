package io.github.geancarloslc;

import io.github.geancarloslc.domain.entity.Paciente;


import java.util.ArrayList;
import java.util.List;


public class Imc {
    public static void main(String[] args) {
        List<Paciente> listaPacientes = new ArrayList<>();
        listaPacientes.add(new Paciente(54.00, 1.68));
        listaPacientes.add(new Paciente(80.00, 1.65));

        listaPacientes.forEach(paciente ->
                System.out.println(paciente.diagnostico())
        );
    }
}
