package efficiency.makeitcheap.item47

inline class StudentId(val studentId: Int)
inline class TeacherId(val teacherId: Int)
inline class SchoolId(val studentId: Int)

//@Entity(tableName = "grades")
class Grades(
    // @ColumnInfo(name = "studentId")
    val studentId: StudentId,
    // @ColumnInfo(name = "teacherId")
    val teacherId: TeacherId,
    // @ColumnInfo(name = "schoolId")
    val schoolId: SchoolId,
)