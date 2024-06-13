package com.vmware.vim25;

import com.vmware.vim25.HealthUpdate;
import com.vmware.vim25.QueryHealthUpdatesResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryHealthUpdatesResponse")
public class QueryHealthUpdatesResponse {
  protected List<HealthUpdate> returnval;
  
  public List<HealthUpdate> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
