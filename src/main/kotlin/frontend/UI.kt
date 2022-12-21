package frontend

class UI {

    companion object {
        private fun getSimpleMenuInput(): Int {
            val input = readLine()
            val inputInt: Int
            if (input.isNullOrEmpty()) {
                showWrongInput()
                return getSimpleMenuInput()
            } else {
                try {                                   //try catch in UI in ordnung?
                    inputInt = input.toInt()
                } catch (e: NumberFormatException) {
                    showWrongInput()
                    return getSimpleMenuInput()
                }
            }
            if ((inputInt != 1) && (inputInt != 2) && (inputInt != 3)) {
                showWrongInput()
                return getSimpleMenuInput()
            }
            return inputInt
        }

        private fun getComplexMenuInput(): Int {
            val input = readLine()
            val inputInt: Int
            if (input.isNullOrEmpty()) {
                showWrongInput()
                return getComplexMenuInput()
            } else {
                try {
                    inputInt = input.toInt()
                } catch (e: NumberFormatException) {
                    showWrongInput()
                    return getComplexMenuInput()
                }
            }
            if ((inputInt != 1) && (inputInt != 2) && (inputInt != 3) && (inputInt != 4)) {
                showWrongInput()
                return getComplexMenuInput()
            }
            return inputInt
        }

        fun getBankMenuInput(): Int {
            println("Welcome to Cherry Banks!\n")
            println("Press \"1\" to add a new customer")
            println("Press \"2\" to choose customer")
            println("Press \"3\" to exit Bank")
            return getSimpleMenuInput()
        }

        fun getCustomerActionInput(): Int {
            println("Press \"1\" to add new account")
            println("Press \"2\" to choose account")
            println("Press \"3\" to delete customer")
            println("Press \"4\" to exit")
            return getComplexMenuInput()
        }

        fun getFirstName(): String {
            println("Adding new Customer...")
            println("Enter First Name")
            val firstName: String = readLine().toString()
            if (firstName.isEmpty()) {
                showWrongInput()
                return getFirstName()
            }
            return firstName
        }

        fun getLastName(): String {
            println("Enter Last Name")
            val lastName: String = readLine().toString()
            if (lastName.isEmpty()) {
                showWrongInput()
                return getLastName()
            }
            return lastName
        }

        fun getCustomerId(): Int {
            println("Choosing Customer...")
            println("Enter Customer ID")
            val id = readLine()
            if (id.isNullOrEmpty()) {
                showWrongInput()
                return getCustomerId()
            }
            return try {
                id.toInt()
            } catch (e: NumberFormatException) {
                showWrongInput()
                return getCustomerId()
            }
        }

        fun getAccountChoiceInput(): Int {
            println("Press \"1\" to add new Checking Account")
            println("Press \"2\" to add new Savings Account")
            println("Press \"3\" to exit")
            return getSimpleMenuInput()
        }

        fun getAmount(): Double {
            println("Please enter amount")
            val startBalance = readLine()
            return if (startBalance.isNullOrEmpty()) {
                0.0
            } else {
                try {
                    startBalance.toDouble()
                } catch (e: NumberFormatException) {
                    showWrongInput()
                    return getAmount()
                }
            }
        }

        fun getAccountId(): Int {
            println("Choosing Account...")
            println("Enter Account ID")
            val accountId = readLine()
            if (accountId.isNullOrEmpty()) {
                showWrongInput()
                return getAccountId()
            }
            return try {
                accountId.toInt()
            } catch (e: NumberFormatException) {
                showWrongInput()
                return getAccountId()
            }
        }

        fun getAccountActionInput(): Int {
            println("Press \"1\" to deposit")
            println("Press \"2\" to withdraw")
            println("Press \"3\" to delete")
            println("Press \"4\" to exit")
            return getComplexMenuInput()
        }

        fun showWrongInput() {
            println("Wrong input, please try again!\n")
        }

        fun showNoElements() {
            println("Sorry, no Elements yet. Going back to Menu\n")
        }

        fun showIllegalAmount() {
            println("Amount not excepted. Please try again!\n")
        }

        fun showDeleted() {
            println("Deleted\n")
        }
    }
}