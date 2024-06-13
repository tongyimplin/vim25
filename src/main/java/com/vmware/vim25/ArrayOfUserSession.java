package com.vmware.vim25;

import com.vmware.vim25.ArrayOfUserSession;
import com.vmware.vim25.UserSession;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUserSession", propOrder = {"userSession"})
public class ArrayOfUserSession {
  @XmlElement(name = "UserSession")
  protected List<UserSession> userSession;
  
  public List<UserSession> getUserSession() {
    if (this.userSession == null)
      this.userSession = new ArrayList<>(); 
    return this.userSession;
  }
}
