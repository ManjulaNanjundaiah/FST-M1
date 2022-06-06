"""
Using pytest:
Create a new test file and do the following:
    Create a fixture named wallet() that initializes the variable 'amount' with 0
    Create a test with the following parameters:
Write a test that performs the following scenario with the parameters
            My wallet initially has 0,
            I add {earned} units of cash to the wallet,
            I spend {spent} units of cash, and
            I should have {expected} units of cash remaining after the two transactions.

"""

import pytest

@pytest.fixture
def wallet_amount():
   amount = 0
   return amount
   
@pytest.mark.parametrize("earned, spent, expected", [ (30, 10, 20), (20, 2, 18), ])
def test_transactions(wallet_amount, earned, spent, expected):
    print("")
    txt  = "My wallet initially has {}"
    print(txt.format(wallet_amount))

    txt1  = "I add {} units of cash to the wallet"
    print(txt1.format(earned)) 
     
    txt2 =  "I spend {} units of cash, and"
    print(txt2.format(spent))

    txt3 = "I should have {} units of cash remaining after the two transactions."
    print(txt3.format(expected))

