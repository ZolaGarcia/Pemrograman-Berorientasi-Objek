class Email
{
  public void SendMail(string fromEmailId, string toEmailId, string subject, string body)
  {
    Console.WriteLine("Sending email to one");
    Console.WriteLine($"Email send to {toEmailId}");
  }

  public void SendMail(string fromEmailId, string[] toEmailList, string subject, string body)
  {
    Console.WriteLine("Sending email to many");
    for(var i=0; i<toEmailList.Length; i++) 
    {
      Console.WriteLine($"Email send to {toEmailList[i]}");
    }
  }
}
