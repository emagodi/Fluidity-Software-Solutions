package solutions.fluidity.test.service;

import org.springframework.stereotype.Component;
import solutions.fluidity.test.exception.CustomRunTimeException;
import solutions.fluidity.test.premiershipapi.BootstrapStatic;

import java.io.IOException;

@Component
public class BootstrapService {

    private BootstrapStatic bootstrapStatic;

    public BootstrapService(BootstrapStatic bootstrapStatic) {
        this.bootstrapStatic = bootstrapStatic;
    }

    public String getBootstrapData() throws IOException {
        try {
            return bootstrapStatic.lookup();
        }
        catch (IOException ex) {
            throw new IOException("BOOTSTRAP IO EXCEPTION::");
        } catch (IllegalArgumentException ex) {
            throw new CustomRunTimeException("BOOTSTRAP RUN TIME EXCEPTION::");
        }
    }
}