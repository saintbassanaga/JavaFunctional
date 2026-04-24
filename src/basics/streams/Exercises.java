package basics.streams;

public class Exercises {

    /*
     * FULL 125-TASK STREAM PRACTICE SHEET
     *
     * Files:
     * - Input.java   -> fixed source data
     * - Result.java  -> exact expected answers for the first 50 canonical tasks
     *
     * Usage:
     * 1. Solve tasks 1-50 and verify against Result.java.
     * 2. Solve tasks 51-125 as advanced extensions.
     * 3. For tasks without predefined answers, validate by printing and reasoning carefully.
     */

    public static final String[] TASKS = {
            "001. From Input.RAW_NAMES, trim values, remove nulls and blanks, and return the cleaned names in original order.",
            "002. From Input.RAW_NAMES, normalize to lowercase, trim, remove nulls/blanks, remove duplicates, and keep insertion order.",
            "003. Count how many values in Input.RAW_NAMES are either null, empty, or blank after trimming.",
            "004. From Input.RAW_NUMBERS, return only even numbers in original order.",
            "005. From Input.RAW_NUMBERS, return distinct numbers sorted ascending.",
            "006. Sum only positive numbers from Input.RAW_NUMBERS.",
            "007. Compute the average of positive numbers from Input.RAW_NUMBERS.",
            "008. Find the second highest distinct number from Input.RAW_NUMBERS.",
            "009. Return only odd numbers from Input.RAW_NUMBERS.",
            "010. Return numbers greater than 10 sorted descending.",
            "011. Return the square of every number from Input.RAW_NUMBERS.",
            "012. Count how many distinct positive numbers exist in Input.RAW_NUMBERS.",
            "013. Find the maximum number from Input.RAW_NUMBERS.",
            "014. Find the minimum number from Input.RAW_NUMBERS.",
            "015. Join all non-blank cleaned names using ', '.",
            "016. Return name lengths for all cleaned non-blank names.",
            "017. Return only cleaned names that start with 'A' or 'a'.",
            "018. Group cleaned non-blank names by their first lowercase character.",
            "019. Count occurrences of normalized lowercase names.",
            "020. Partition Input.RAW_NUMBERS into positive and non-positive values.",

            "021. From Input.EMPLOYEES, return the names of all active employees.",
            "022. Return the names of all employees in the Engineering department.",
            "023. Group employees by department and count how many employees each department has.",
            "024. Group employees by department and compute the average salary for each department.",
            "025. Compute the total salary of all Engineering employees.",
            "026. Find the name of the highest paid employee.",
            "027. Find the highest salary value.",
            "028. Find the name of the youngest employee.",
            "029. Extract all distinct skills used by employees.",
            "030. Return the names of employees who joined after 2024-01-01.",
            "031. Partition employees by active status and return a map of status to employee names.",
            "032. Return the names of the top 3 highest paid employees in descending salary order.",
            "033. Return employee emails for the Support department.",
            "034. Return all departments sorted alphabetically without duplicates.",
            "035. Count how many employees are older than 30.",
            "036. Return all employee names sorted by age, then by name.",
            "037. Return active employee names sorted by salary descending.",
            "038. Return employees whose salary is at least 5000.",
            "039. Find whether all employees have at least one skill.",
            "040. Find whether any employee belongs to HR.",
            "041. Return the number of inactive employees.",
            "042. Group employee names by department with each group sorted alphabetically.",
            "043. Compute total salary by department.",
            "044. Find the department with the highest average salary.",
            "045. Return all employees who have the skill 'Java'.",
            "046. Return all employees who have either 'Java' or 'Security'.",
            "047. Count frequency of all skills across all employees.",
            "048. Return all distinct roles sorted alphabetically.",
            "049. Build a comma-separated string of active Engineering employee names sorted alphabetically.",
            "050. Verify whether all active employees have a non-null, non-blank email.",

            "051. From Input.INVOICES, return the IDs of unpaid overdue invoices as of 2026-04-23.",
            "052. Compute the total unpaid invoice amount.",
            "053. Group unpaid invoice amounts by employeeId.",
            "054. Return paid invoice IDs only.",
            "055. Count invoices by paid status.",
            "056. Find the highest invoice amount.",
            "057. Find the employeeId owning the largest invoice.",
            "058. Return unpaid invoices sorted by due date ascending.",
            "059. Group invoice IDs by paid status.",
            "060. Return employeeIds that have more than one invoice.",
            "061. Compute total invoice amount per employeeId regardless of paid status.",
            "062. Return invoice IDs due in April 2026.",
            "063. Find the earliest due date among unpaid invoices.",
            "064. Return overdue unpaid invoice IDs sorted by amount descending.",
            "065. Join overdue unpaid invoice IDs into one comma-separated string.",

            "066. From Input.TRANSACTIONS, return the IDs of failed transactions.",
            "067. Compute the total amount of successful transactions.",
            "068. Group transactions by status and count them.",
            "069. Group successful transaction amounts by employeeId and sum them.",
            "070. For each employeeId present in transactions, find the timestamp of that employee's latest transaction.",
            "071. Return the employee IDs that have at least one successful transaction amount greater than 1000.",
            "072. Return only successful TRANSFER transactions.",
            "073. Count transactions by type.",
            "074. Find the highest successful transaction amount.",
            "075. Return failed transaction IDs sorted by amount descending.",
            "076. Compute total failed transaction amount.",
            "077. Return employeeIds that have both SUCCESS and FAILED transactions.",
            "078. Group transaction IDs by employeeId.",
            "079. Return the latest successful transaction object.",
            "080. Return successful transaction totals by type.",
            "081. Count successful transactions per employeeId.",
            "082. Return all transaction dates without time, distinct and sorted.",
            "083. Find the first transaction chronologically.",
            "084. Find the last transaction chronologically.",
            "085. Build a map of employeeId to latest transaction status.",

            "086. Group logs by level and count them.",
            "087. Group logs by service and count them.",
            "088. Find the first timestamp where 3 consecutive logs are ERROR level.",
            "089. Return the service names that have at least 2 ERROR logs.",
            "090. Return only ERROR log messages.",
            "091. Count ERROR logs by service.",
            "092. Return distinct log levels sorted alphabetically.",
            "093. Find the earliest log timestamp.",
            "094. Find the latest log timestamp.",
            "095. Partition logs into ERROR and non-ERROR.",
            "096. Return services that emitted at least one INFO log.",
            "097. Return log messages for billing-service only.",
            "098. Return the number of services represented in logs.",
            "099. Group log messages by service.",
            "100. Join all ERROR log messages using ' | '.",

            "101. Using Input.ORDERS, compute the total quantity of all ordered items across all orders.",
            "102. Compute the total monetary value of all orders: quantity * unitPrice for every item.",
            "103. Find the product name of the most expensive single item by unit price.",
            "104. Return all distinct order item categories.",
            "105. Group ordered quantities by category and sum the quantities.",
            "106. Group total order value by employeeId.",
            "107. Return the employee names of people who ordered at least one Hardware category item.",
            "108. Return only PAID orders.",
            "109. Count orders by status.",
            "110. Find the total quantity of Accessories items only.",
            "111. Find the total quantity of Hardware items only.",
            "112. Return all product names across all orders without duplicates, sorted alphabetically.",
            "113. Find the cheapest product by unit price.",
            "114. Find the order ID with the highest total order value.",
            "115. Group product names by category.",
            "116. Return employees who made more than one order. If none, return an empty list.",
            "117. Return all order IDs sorted by orderedAt descending.",
            "118. Return the average unit price of all Office items.",
            "119. Count total number of order items across all orders.",
            "120. Build a map of orderId to total item quantity.",

            "121. Return active Engineering employee emails sorted alphabetically.",
            "122. Return active employee IDs that currently have overdue unpaid invoices as of 2026-04-23.",
            "123. Find the most recent join date among employees.",
            "124. Find the name of the most recently joined employee.",
            "125. Build a mini dashboard summary: totalEmployees, activeEmployees, unpaidInvoiceTotal, successfulTransactionTotal, totalOrderValue."
    };

    public static void main(String[] args) {
        for (String task : TASKS) {
            System.out.println(task);
        }
    }
}
