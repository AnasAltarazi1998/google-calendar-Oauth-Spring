// package org.closure.googlecalendar;

// import java.io.IOException;
// import java.security.GeneralSecurityException;
// import java.security.Principal;
// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestParam;


// public class CalendarController {
//     @Autowired
//     CalendarService calendarService;

//     @GetMapping(value = "/oauth/google/calendar")
//     public List<String> googleOauth() throws IOException, GeneralSecurityException
//     {
//         return calendarService.calendarTest();
//     }
    
//     @GetMapping(value="/Callback/{token}")
//     public String getMethodName(@PathVariable(name = "token") String token) {
        
//         return token;
//     }
// }
