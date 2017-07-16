package koans

import groovy.transform.TupleConstructor
import org.junit.Test

class Coercion {

    @Test
    void "coercion between different classes"() {
        BeneficiaryProfile beneficiary = [10, "Ministry Of Finance", ["KWNBOK00000000123456"]]
        def consumer = beneficiary as ConsumerProfile
        assert consumer.class.is(ConsumerProfile)
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