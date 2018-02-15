public class BigOExample {
    /**
     * Returns the largest element in an array of doubles
     */
    public static double max(double[] a) { // n = a.length
        double max = a[0];                  // two or three operations: initialization, reference, and assignment
        for (int i = 1; i < a.length; i++) { // ~1 for int i assignment, 3 * n steps for conditional statement, 2 * n for incrementation
            if (a[i] > max) {                 // 4 * n
                max = a[i];                    // 3 * n
            }
        }
        return max;                             // 1 step
        // total is roughly 12n + 4, but take that with a MASSIVE barrel of salt
//       )_(                                            _
//       | |                                           [_ ]
//     .-'-'-.       _                               .-'. '-.
//    /-::_..-\    _[_]_                            /:;/ _.-'\
//    )_     _(   /_   _\      [-]                  |:._   .-|
//    |;::    |   )_``'_(    .-'-'-.       (-)      |:._     |
//    |;::    |   |;:   |    :-...-:     .-'-'-.    |:._     |
//    |;::    |   |;:   |    |;:   |     |-...-|    |:._     |
//    |;::-.._|   |;:.._|    |;:.._|     |;:.._|    |:._     |
//    `-.._..-'   `-...-'    `-...-'     `-...-'    `-.____.-'    cjr

    }
}
