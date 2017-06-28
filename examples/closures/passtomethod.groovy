// Method with two arguments. Last argument is a closure.
def work(input, cl) {
    cl(input)
}
// Define a closure.
def assertJava = { it == 'Java' }

// 'Normal' method invocation.
work('Java', assertJava)
// No parenthesis.
work 'Java', assertJava
// Anonymous closure as argument.
work('Groovy', {
    assert it == 'Groovy'
})
// Last argument is closure and can be outside parenthesis.
work('Groovy') {
    assert it == 'Groovy'
}
// Opening bracket on new line.
// If we want a code block (e.g. static initializer)
// instead of closure we must use ; to separate code.
work('Groovy')
{
    assert it == 'Groovy'
}
// Pay attention, no parenthesis, so comma is needed again!
work 'Groovy', {
    assert it == 'Groovy'
}
// Does not work:
//
// Comma between argument list needed:
// work 'Groovy' {
//     assert it == 'Groovy'
// }
