package com.vmware.vim25;

import com.vmware.vim25.RetrieveHostCustomizationsForProfileResponse;
import com.vmware.vim25.StructuredCustomizations;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "RetrieveHostCustomizationsForProfileResponse")
public class RetrieveHostCustomizationsForProfileResponse {
  protected List<StructuredCustomizations> returnval;
  
  public List<StructuredCustomizations> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
