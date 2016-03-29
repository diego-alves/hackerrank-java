package dfqalves.hackerrank.algorithms.implementation;

import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;


/**
 * Created by cin_dalves on 3/29/16.
 */
public class EncryptionTest {

    @Test
    public void testEncrypt() throws Exception {
        String encrypted = Encryption.encrypt("ifmanwasmeanttostayonthegroundgodwouldhavegivenusroots");
        assertThat(encrypted, is(equalTo("imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau")));
    }


    @Test
    public void testEncryptChillout() throws Exception {
        String encrypted = Encryption.encrypt("chillout");
        assertThat(encrypted, is(equalTo("clu hlt io")));
    }


}