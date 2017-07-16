def s = '''\
username;language,like
mr,Groovy;yes
'''

assert s.split() instanceof String[]
assert s.split() == ['username;language,like', 'mr,Groovy;yes']  // Default split on whitespace. ( \t\n\r\f)
assert s.split(/(;|,|\n)/) == ['username', 'language', 'like', 'mr', 'Groovy', 'yes']  // Split argument is a regular expression.

def result = []
s.splitEachLine(",") {
    result << it  // it is list with result of split on ,
}
assert result[0] == ['username;language', 'like']
assert result[1] == ['mr', 'Groovy;yes']

assert s.tokenize() instanceof List
assert s.tokenize() == ['username;language,like', 'mr,Groovy;yes']  // Default tokenize on whitespace. ( \t\n\r\f)
assert s.tokenize("\n;,") == ['username', 'language', 'like', 'mr', 'Groovy', 'yes']  // Argument is a String with all tokens we want to tokenize on.
