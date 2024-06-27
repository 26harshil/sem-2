
function displayName() {

    temp = document.getElementById("res");
    tempString = "";
    tempString += "<table border='1'>";
    for(i=0;i<names.length;i++){
        tempString += "<tr>";
        tempString += "<td>"+names[i]+"</td>";
        tempString += "<td><button onclick='deleteStudent("+i+")'>Delete</button></td>";
        tempString += "<td><button onclick='setStudent("+i+")'>Edit</button></td>";
        tempString += "</tr>";
    }
    tempString += "</table>";

    temp.innerHTML = tempString;
}
displayName();
