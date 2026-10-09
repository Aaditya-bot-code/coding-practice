// HackerRank Problem: Students Marks Sum
// Link: https://www.hackerrank.com/challenges/students-marks-sum/problem
// Difficulty: Easy
// Language: c




//Complete the following function.

int marks_summation(int* marks, int number_of_students, char gender) {
    int s=0,i;
    for(i=(gender=='b'?0:gender=='g'?1:-1);i<number_of_students;i+=2)
    s+=marks[i];
    return s;
    
}

