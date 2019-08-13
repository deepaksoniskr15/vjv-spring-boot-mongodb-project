

#Running Examples

1. Download the zip or clone the Git repository.

2. Unzip the zip file (if you downloaded one)

3. Open Eclipse/Spring tool suite

4. File -> Import -> Existing Maven Project -> Navigate to the folder where you unzipped the zip

5. Select the right project

6. Choose the Spring Boot Application file Right Click on the file and Run as Java Application (if you are using Spring tool suite than just click on project and run as Spring Boot Application), It will deploy and application in selected tomcat server. 

You are all Set

#Software installation required

Java 1.8(+)
mongodb
Maven latest version
eclipse/spring tool suite
Postman (Or any rest client to access web services)

#Api curl request

1. Add Patient

Request:
curl -X POST \
  http://localhost:8080/api/patient/add \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -H 'postman-token: 7d23cab2-c5ba-3644-7da5-48e9c26beb23' \
  -d '{
  "patientName": "Monica Latte",
  "homePhone": "444-444-4444",
  "address": " 4444 Coffee Ave Chocolate, California",
  "officePhone": "admin",
  "fax": "",
  "birthDate": "04/04/1950",
  "status": "Active",
  "gender": "Female",
  "maritalStatus": "Divorced",
  "contactBy": "Phone",
  "race": "Black",
  "socSecNo": "444-444-4444",
  "language": "English",
  "respProv": "Carl Savem",
  "mrn": "MR-111-1111",
  "referredBy": "Full-time",
  "empStatus": "No",
  "email": "",
  "sensChart": "",
  "homeLOC": "WeServeEveryone",
  "externalID": "MR-111-1111",
  "problems": [
    "DIABETES MELLITUS (ICD-250.)",
    "HYPERTENSION, BENIGN ESSENTIAL (ICD-401.1)"
  ],
  "medications": [
    "PRINIVIL TABS 20 MG (LISINOPRIL) 1 po qd",
    "HUMULIN INJ 70/30 (INSULIN REG & ISOPHANE (HUMAN)) 20 units ac breakfast"
  ],
  "patientHistory": {
    "diseaseName": "Hyperglycemic Symptoms",
    "data": [
      {
        "key": "Polyuria",
        "value": "no"
      },
       {
        "key": "Polydipsia",
        "value": "no"
      }
    ]
  },
  "physicalExam": [
    {
      "key": "General Appearance",
      "value": "well developed, well nourished, no acute distress"
    },
    {
      "key": "Eyes",
      "value": "conjunctiva and lids normal, PERRLA, EOMI, fundi WNL"
    }
  ],
  "hospitalName": "WeServeEveryone Clinic",
  "hospitalFax": "111-111-1111",
  "hospitalPhone": ""
}'

Response: 
{
    "statusCode": 200,
    "status": "OK",
    "message": "Patient Has Been Added Successfully",
    "data": {
        "id": "5d52b75974eacf33a4ac2d58",
        "createdAt": "Aug 13, 2019, 18:42",
        "updatedAt": "Aug 13, 2019, 18:42",
        "patientName": "Monica Latte",
        "homePhone": "444-444-4444",
        "address": " 4444 Coffee Ave Chocolate, California",
        "officePhone": "admin",
        "fax": "",
        "birthDate": "04/04/1950",
        "status": "Active",
        "gender": "Female",
        "maritalStatus": "Divorced",
        "contactBy": "Phone",
        "race": "Black",
        "socSecNo": "444-444-4444",
        "language": "English",
        "respProv": "Carl Savem",
        "mrn": "MR-111-1111",
        "referredBy": "Full-time",
        "empStatus": "No",
        "email": "",
        "sensChart": "",
        "homeLOC": "WeServeEveryone",
        "externalID": "MR-111-1111",
        "problems": [
            "DIABETES MELLITUS (ICD-250.)",
            "HYPERTENSION, BENIGN ESSENTIAL (ICD-401.1)"
        ],
        "medications": [
            "PRINIVIL TABS 20 MG (LISINOPRIL) 1 po qd",
            "HUMULIN INJ 70/30 (INSULIN REG & ISOPHANE (HUMAN)) 20 units ac breakfast"
        ],
        "patientHistory": {
            "diseaseName": "Hyperglycemic Symptoms",
            "data": [
                {
                    "key": "Polyuria",
                    "value": "no"
                },
                {
                    "key": "Polydipsia",
                    "value": "no"
                }
            ]
        },
        "physicalExam": [
            {
                "key": "General Appearance",
                "value": "well developed, well nourished, no acute distress"
            },
            {
                "key": "Eyes",
                "value": "conjunctiva and lids normal, PERRLA, EOMI, fundi WNL"
            }
        ],
        "hospitalName": "WeServeEveryone Clinic",
        "hospitalFax": "111-111-1111",
        "hospitalPhone": "",
        "hash": "39e9a318ca82f43b6672041f73c68f4f12b7c95cbfc2e2ea1eaf0066f2bc53bf"
    }
}

2. Get Patient

Request: (change Id 5d52b75974eacf33a4ac2d58 from add Api response)

curl -X GET \
  http://localhost:8080/api/patient/get/5d52b75974eacf33a4ac2d58 \
  -H 'cache-control: no-cache' \
  -H 'postman-token: c8fc3106-2fa8-140e-1653-66500a410b1d'

Response:

{
    "statusCode": 200,
    "status": "OK",
    "message": "success",
    "data": {
        "id": "5d52b75974eacf33a4ac2d58",
        "createdAt": "Aug 13, 2019, 18:42",
        "updatedAt": "Aug 13, 2019, 18:42",
        "patientName": "Monica Latte",
        "homePhone": "444-444-4444",
        "address": " 4444 Coffee Ave Chocolate, California",
        "officePhone": "admin",
        "fax": "",
        "birthDate": "04/04/1950",
        "status": "Active",
        "gender": "Female",
        "maritalStatus": "Divorced",
        "contactBy": "Phone",
        "race": "Black",
        "socSecNo": "444-444-4444",
        "language": "English",
        "respProv": "Carl Savem",
        "mrn": "MR-111-1111",
        "referredBy": "Full-time",
        "empStatus": "No",
        "email": "",
        "sensChart": "",
        "homeLOC": "WeServeEveryone",
        "externalID": "MR-111-1111",
        "problems": [
            "DIABETES MELLITUS (ICD-250.)",
            "HYPERTENSION, BENIGN ESSENTIAL (ICD-401.1)"
        ],
        "medications": [
            "PRINIVIL TABS 20 MG (LISINOPRIL) 1 po qd",
            "HUMULIN INJ 70/30 (INSULIN REG & ISOPHANE (HUMAN)) 20 units ac breakfast"
        ],
        "patientHistory": {
            "diseaseName": "Hyperglycemic Symptoms",
            "data": [
                {
                    "key": "Polyuria",
                    "value": "no"
                },
                {
                    "key": "Polydipsia",
                    "value": "no"
                }
            ]
        },
        "physicalExam": [
            {
                "key": "General Appearance",
                "value": "well developed, well nourished, no acute distress"
            },
            {
                "key": "Eyes",
                "value": "conjunctiva and lids normal, PERRLA, EOMI, fundi WNL"
            }
        ],
        "hospitalName": "WeServeEveryone Clinic",
        "hospitalFax": "111-111-1111",
        "hospitalPhone": "",
        "hash": "39e9a318ca82f43b6672041f73c68f4f12b7c95cbfc2e2ea1eaf0066f2bc53bf"
    }
}
