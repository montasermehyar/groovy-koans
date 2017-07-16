def name ='mr'

def s = "This is not a multiline\
 String, $name, but the continuation\
 character (\\) makes it more readable."

assert s == 'This is not a multiline String, mr, but the continuation character (\\) makes it more readable.'
