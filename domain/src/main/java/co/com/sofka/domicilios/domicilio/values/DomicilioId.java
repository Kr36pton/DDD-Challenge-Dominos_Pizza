package co.com.sofka.domicilios.domicilio.values;

import co.com.sofka.domain.generic.Identity;

public class DomicilioId extends Identity{
    public DomicilioId(String id) {
        super(id);
    }

    public static DomicilioId of(String id) {
        return new DomicilioId(id);
    }
}
