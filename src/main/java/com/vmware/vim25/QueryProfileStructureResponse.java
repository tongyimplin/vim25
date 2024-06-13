package com.vmware.vim25;

import com.vmware.vim25.ProfileProfileStructure;
import com.vmware.vim25.QueryProfileStructureResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryProfileStructureResponse")
public class QueryProfileStructureResponse {
  @XmlElement(required = true)
  protected ProfileProfileStructure returnval;
  
  public ProfileProfileStructure getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(ProfileProfileStructure paramProfileProfileStructure) {
    this.returnval = paramProfileProfileStructure;
  }
}
