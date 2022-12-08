import java.util.*;
import java.text.*;

String x=request.getParameter("dataUsuario");
SimpleDataFormat sdf1= new SimpleDataFormat("dd/mm/yyyy");
Date dataUsuario=sdf1.parse(stx);
