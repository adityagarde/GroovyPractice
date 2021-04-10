class CourseTask {
    static void main(String[] args) {
        List<Integer> numbers = readAllNumbers()
        println(numbers)

        Integer maxValue = numbers.max()
        println maxValue

        println numbers.sum()
    }
    private static List<Integer> readAllNumbers() {
        File resources = new File("resources")
        List<Integer> numbers = []

        resources.eachFile { file ->
            file.eachLine {
                if(it.isNumber()) {
                    numbers.add(Integer.parseInt(it))
                }
            }
        }
        return numbers
    }
}
