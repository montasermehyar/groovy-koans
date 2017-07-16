package koans

import groovy.transform.TupleConstructor
import org.junit.Test

class Coercion {

    @Test
    void "coercion between different classes"() {
        BeneficiaryProfile beneficiary = [10, "Ministry Of Finance", ["KWNBOK00000000123456"]]
        // ------------ START EDITING HERE ----------------------
        def consumer
        // ------------ STOP EDITING HERE  ----------------------
        assert consumer.class.is(ConsumerProfile)
        assert consumer.name == beneficiary.name
    }

    @Test
    void "coercion in constructor"() {
        // ------------ START EDITING HERE ----------------------
        def beneficiary = [10, "Ministry Of Finance", ["KWNBOK00000000123456"]]
        // ------------ STOP EDITING HERE  ----------------------
        assert beneficiary.class.is(BeneficiaryProfile)
    }

    @Test
    void "coercion in when converting a closure into interface"() {

    }
}


@TupleConstructor
class BeneficiaryProfile {
    Long profileId
    String name
    List beneficiaryAccounts

    def asType(Class clazz) {
        if (clazz == ConsumerProfile) {
            [profileId, name, beneficiaryAccounts] as ConsumerProfile
        }
    }

}


@TupleConstructor
class ConsumerProfile {
    Long profileId
    String name
    List beneficiaryAccounts
}