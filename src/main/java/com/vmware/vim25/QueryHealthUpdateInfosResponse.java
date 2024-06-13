package com.vmware.vim25;

import com.vmware.vim25.HealthUpdateInfo;
import com.vmware.vim25.QueryHealthUpdateInfosResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryHealthUpdateInfosResponse")
public class QueryHealthUpdateInfosResponse {
  protected List<HealthUpdateInfo> returnval;
  
  public List<HealthUpdateInfo> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
