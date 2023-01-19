package com.outerspace.a20230119_luisviruena_nycschools.content

class School {
    @com.squareup.moshi.Json(name = "dbn")
    lateinit var dbn: String
    @com.squareup.moshi.Json(name = "school_name")
    lateinit var schoolName: String
    @com.squareup.moshi.Json(name = "boro")
    lateinit var boro: String
    @com.squareup.moshi.Json(name = "overview_paragraph")
    lateinit var overviewParagraph: String
    @com.squareup.moshi.Json(name = "school_10th_seats")
    lateinit var school10thSeats: String
    @com.squareup.moshi.Json(name = "academicopportunities1")
    lateinit var academicopportunities1: String
    @com.squareup.moshi.Json(name = "academicopportunities2")
    lateinit var academicopportunities2: String
    @com.squareup.moshi.Json(name = "academicopportunities3")
    lateinit var academicopportunities3: String
    @com.squareup.moshi.Json(name = "academicopportunities4")
    lateinit var academicopportunities4: String
    @com.squareup.moshi.Json(name = "academicopportunities5")
    lateinit var academicopportunities5: String
    @com.squareup.moshi.Json(name = "ell_programs")
    lateinit var ellPrograms: String
    @com.squareup.moshi.Json(name = "language_classes")
    lateinit var languageClasses: String
    @com.squareup.moshi.Json(name = "advancedplacement_courses")
    lateinit var advancedplacementCourses: String
    @com.squareup.moshi.Json(name = "neighborhood")
    lateinit var neighborhood: String
    @com.squareup.moshi.Json(name = "building_code")
    lateinit var buildingCode: String
    @com.squareup.moshi.Json(name = "location")
    lateinit var location: String
    @com.squareup.moshi.Json(name = "phone_number")
    lateinit var phoneNumber: String
    @com.squareup.moshi.Json(name = "fax_number")
    lateinit var faxNumber: String
    @com.squareup.moshi.Json(name = "school_email")
    lateinit var schoolEmail: String
    @com.squareup.moshi.Json(name = "website")
    lateinit var website: String
    @com.squareup.moshi.Json(name = "subway")
    lateinit var subway: String
    @com.squareup.moshi.Json(name = "bus")
    lateinit var bus: String
    @com.squareup.moshi.Json(name = "grades2018")
    lateinit var grades2018: String
    @com.squareup.moshi.Json(name = "finalgrades")
    lateinit var finalgrades: String
    @com.squareup.moshi.Json(name = "total_students")
    lateinit var totalStudents: String
    @com.squareup.moshi.Json(name = "start_time")
    lateinit var startTime: String
    @com.squareup.moshi.Json(name = "end_time")
    lateinit var endTime: String
    @com.squareup.moshi.Json(name = "addtl_info1")
    lateinit var addtlInfo1: String
    @com.squareup.moshi.Json(name = "extracurricular_activities")
    lateinit var extracurricularActivities: String
    @com.squareup.moshi.Json(name = "psal_sports_boys")
    lateinit var psalSportsBoys: String
    @com.squareup.moshi.Json(name = "psal_sports_girls")
    lateinit var psalSportsGirls: String
    @com.squareup.moshi.Json(name = "psal_sports_coed")
    lateinit var psalSportsCoed: String
    @com.squareup.moshi.Json(name = "school_sports")
    lateinit var schoolSports: String
    @com.squareup.moshi.Json(name = "graduation_rate")
    lateinit var graduationRate: String
    @com.squareup.moshi.Json(name = "attendance_rate")
    lateinit var attendanceRate: String
    @com.squareup.moshi.Json(name = "pct_stu_enough_variety")
    lateinit var pctStuEnoughVariety: String
    @com.squareup.moshi.Json(name = "college_career_rate")
    lateinit var collegeCareerRate: String
    @com.squareup.moshi.Json(name = "pct_stu_safe")
    lateinit var pctStuSafe: String
    @com.squareup.moshi.Json(name = "prgdesc1")
    lateinit var prgdesc1: String
    @com.squareup.moshi.Json(name = "prgdesc2")
    lateinit var prgdesc2: String
    @com.squareup.moshi.Json(name = "prgdesc3")
    lateinit var prgdesc3: String
    @com.squareup.moshi.Json(name = "requirement1_2")
    lateinit var requirement12: String
    @com.squareup.moshi.Json(name = "requirement2_2")
    lateinit var requirement22: String
    @com.squareup.moshi.Json(name = "requirement3_2")
    lateinit var requirement32: String
    @com.squareup.moshi.Json(name = "offer_rate1")
    lateinit var offerRate1: String
    @com.squareup.moshi.Json(name = "offer_rate2")
    lateinit var offerRate2: String
    @com.squareup.moshi.Json(name = "program1")
    lateinit var program1: String
    @com.squareup.moshi.Json(name = "program2")
    lateinit var program2: String
    @com.squareup.moshi.Json(name = "program3")
    lateinit var program3: String
    @com.squareup.moshi.Json(name = "code1")
    lateinit var code1: String
    @com.squareup.moshi.Json(name = "code2")
    lateinit var code2: String
    @com.squareup.moshi.Json(name = "code3")
    lateinit var code3: String
    @com.squareup.moshi.Json(name = "interest1")
    lateinit var interest1: String
    @com.squareup.moshi.Json(name = "interest2")
    lateinit var interest2: String
    @com.squareup.moshi.Json(name = "interest3")
    lateinit var interest3: String
    @com.squareup.moshi.Json(name = "method1")
    lateinit var method1: String
    @com.squareup.moshi.Json(name = "method2")
    lateinit var method2: String
    @com.squareup.moshi.Json(name = "method3")
    lateinit var method3: String
    @com.squareup.moshi.Json(name = "seats9ge1")
    lateinit var seats9ge1: String
    @com.squareup.moshi.Json(name = "seats9ge2")
    lateinit var seats9ge2: String
    @com.squareup.moshi.Json(name = "seats9ge3")
    lateinit var seats9ge3: String
    @com.squareup.moshi.Json(name = "grade9gefilledflag1")
    lateinit var grade9gefilledflag1: String
    @com.squareup.moshi.Json(name = "grade9gefilledflag2")
    lateinit var grade9gefilledflag2: String
    @com.squareup.moshi.Json(name = "grade9gefilledflag3")
    lateinit var grade9gefilledflag3: String
    @com.squareup.moshi.Json(name = "grade9geapplicants1")
    lateinit var grade9geapplicants1: String
    @com.squareup.moshi.Json(name = "grade9geapplicants2")
    lateinit var grade9geapplicants2: String
    @com.squareup.moshi.Json(name = "grade9geapplicants3")
    lateinit var grade9geapplicants3: String
    @com.squareup.moshi.Json(name = "seats9swd1")
    lateinit var seats9swd1: String
    @com.squareup.moshi.Json(name = "seats9swd2")
    lateinit var seats9swd2: String
    @com.squareup.moshi.Json(name = "seats9swd3")
    lateinit var seats9swd3: String
    @com.squareup.moshi.Json(name = "grade9swdfilledflag1")
    lateinit var grade9swdfilledflag1: String
    @com.squareup.moshi.Json(name = "grade9swdfilledflag2")
    lateinit var grade9swdfilledflag2: String
    @com.squareup.moshi.Json(name = "grade9swdfilledflag3")
    lateinit var grade9swdfilledflag3: String
    @com.squareup.moshi.Json(name = "grade9swdapplicants1")
    lateinit var grade9swdapplicants1: String
    @com.squareup.moshi.Json(name = "grade9swdapplicants2")
    lateinit var grade9swdapplicants2: String
    @com.squareup.moshi.Json(name = "grade9swdapplicants3")
    lateinit var grade9swdapplicants3: String
    @com.squareup.moshi.Json(name = "seats101")
    lateinit var seats101: String
    @com.squareup.moshi.Json(name = "seats102")
    lateinit var seats102: String
    @com.squareup.moshi.Json(name = "seats103")
    lateinit var seats103: String
    @com.squareup.moshi.Json(name = "admissionspriority11")
    lateinit var admissionspriority11: String
    @com.squareup.moshi.Json(name = "admissionspriority12")
    lateinit var admissionspriority12: String
    @com.squareup.moshi.Json(name = "admissionspriority13")
    lateinit var admissionspriority13: String
    @com.squareup.moshi.Json(name = "admissionspriority21")
    lateinit var admissionspriority21: String
    @com.squareup.moshi.Json(name = "admissionspriority22")
    lateinit var admissionspriority22: String
    @com.squareup.moshi.Json(name = "grade9geapplicantsperseat1")
    lateinit var grade9geapplicantsperseat1: String
    @com.squareup.moshi.Json(name = "grade9geapplicantsperseat2")
    lateinit var grade9geapplicantsperseat2: String
    @com.squareup.moshi.Json(name = "grade9geapplicantsperseat3")
    lateinit var grade9geapplicantsperseat3: String
    @com.squareup.moshi.Json(name = "grade9swdapplicantsperseat1")
    lateinit var grade9swdapplicantsperseat1: String
    @com.squareup.moshi.Json(name = "grade9swdapplicantsperseat2")
    lateinit var grade9swdapplicantsperseat2: String
    @com.squareup.moshi.Json(name = "grade9swdapplicantsperseat3")
    lateinit var grade9swdapplicantsperseat3: String
    @com.squareup.moshi.Json(name = "primary_address_line_1")
    lateinit var primaryAddressLine1: String
    @com.squareup.moshi.Json(name = "city")
    lateinit var city: String
    @com.squareup.moshi.Json(name = "zip")
    lateinit var zip: String
    @com.squareup.moshi.Json(name = "state_code")
    lateinit var stateCode: String
    @com.squareup.moshi.Json(name = "latitude")
    lateinit var latitude: String
    @com.squareup.moshi.Json(name = "longitude")
    lateinit var longitude: String
    @com.squareup.moshi.Json(name = "community_board")
    lateinit var communityBoard: String
    @com.squareup.moshi.Json(name = "council_district")
    lateinit var councilDistrict: String
    @com.squareup.moshi.Json(name = "census_tract")
    lateinit var censusTract: String
    @com.squareup.moshi.Json(name = "bin")
    lateinit var bin: String
    @com.squareup.moshi.Json(name = "bbl")
    lateinit var bbl: String
    @com.squareup.moshi.Json(name = "nta")
    lateinit var nta: String
    @com.squareup.moshi.Json(name = "borough")
    lateinit var borough: String
}
