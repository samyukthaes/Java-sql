function submitForm() {
    const empId = document.getElementById("emp_id").value;
    const empName = document.getElementById("emp_name").value;
    const empLocation = document.getElementById("emp_location").value;
    const empAddress = document.getElementById("emp_address").value;
    const bloodGroup = document.getElementById("blood_group").value;
    const Experience = document.getElementById("exp").value;
    const Skills = document.getElementById("skills").value;
    const url = `https://jsonplaceholder.typicode.com/posts?emp_id=${empId}&emp_name=${empName}&emp_location=${empLocation}&emp_address=${empAddress}&blood_group=${bloodGroup}`;

    const xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
      if (this.readyState == 4 && this.status == 200) {
        document.getElementById("form_result").innerHTML = this.responseText;
      }
    };
    xhttp.open("GET", url, true);
    xhttp.send();
  }
