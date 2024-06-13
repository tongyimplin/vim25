package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.PropertySpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertySpec", propOrder = {"type", "all", "pathSet"})
public class PropertySpec extends DynamicData {
  @XmlElement(required = true)
  protected String type;
  
  protected Boolean all;
  
  protected List<String> pathSet;
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public Boolean isAll() {
    return this.all;
  }
  
  public void setAll(Boolean paramBoolean) {
    this.all = paramBoolean;
  }
  
  public List<String> getPathSet() {
    if (this.pathSet == null)
      this.pathSet = new ArrayList<>(); 
    return this.pathSet;
  }
}
