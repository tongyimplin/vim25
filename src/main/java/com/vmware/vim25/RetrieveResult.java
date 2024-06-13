package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ObjectContent;
import com.vmware.vim25.RetrieveResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveResult", propOrder = {"token", "objects"})
public class RetrieveResult extends DynamicData {
  protected String token;
  
  @XmlElement(required = true)
  protected List<ObjectContent> objects;
  
  public String getToken() {
    return this.token;
  }
  
  public void setToken(String paramString) {
    this.token = paramString;
  }
  
  public List<ObjectContent> getObjects() {
    if (this.objects == null)
      this.objects = new ArrayList<>(); 
    return this.objects;
  }
}
