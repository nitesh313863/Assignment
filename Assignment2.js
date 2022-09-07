function logic()
{
 let sentence=document.querySelector("#sentence").value
 let letter =document.querySelector("#letter").value
 let lett=letter.charCodeAt(0);
 let result=""
 var flag=false
 if(lett>=65 && lett <=90 || lett>= 97 && lett<=122)
 {
    for(let i=0;i<sentence.length-1;i++)
    {
        
        if(sentence.charAt(i)==letter)
        {
        flag=true
        for(let j=i+1;j<=sentence.length-1;j++)
        {
            result =result+sentence.charAt(j)
        }
        
        break   
        }

    }
    if(flag==true)
    {
        document.getElementById("result").innerHTML=result
        return false
    }
    else{
        document.getElementById("result").innerHTML="The letter does not exist in the sentence"
        return false
    }
    
 }
 else
 {
    alert("Input Valid Letter A-Z")
 } 
}