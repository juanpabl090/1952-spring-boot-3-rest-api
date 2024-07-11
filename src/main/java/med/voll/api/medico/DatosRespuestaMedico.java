package med.voll.api.medico;

import med.voll.api.direccion.DatosDireccion;

public record DatosRespuestaMedico(
        /*
        private Long id;
        private String nombre;
        private String email;
        private String telefono;
        private String documento;
        private boolean activo;
        @Enumerated(EnumType.STRING)
        private Especialidad especialidad;
        @Embedded
        private Direccion direccion;
    */
        Long id,
        String nombre,
        String email,
        String telefono,
        String documento,
        Especialidad especialidad,
        DatosDireccion datosDireccion
) {
}
