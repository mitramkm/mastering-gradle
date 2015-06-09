package ch2;

def s1='This is single quote string.'

def s2="This is double quote string."

def s3="""This is multi line String.
You can write multiple lines here."""

def s4 ="Example of Gstring, You can refer to variable also like ${s1}"

def s5='''This is multi line String.
You can write multiple lines here.'''

def s6 =/ This is 'slashy' String.
It can also contains multiple lines $s1
/


println s1
println s2
println s3
println s4
println s5
println s6