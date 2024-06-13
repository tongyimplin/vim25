package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ElementDescription;
import com.vmware.vim25.EnumDescription;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnumDescription", propOrder = {"key", "tags"})
public class EnumDescription extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  @XmlElement(required = true)
  protected List<ElementDescription> tags;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public List<ElementDescription> getTags() {
    if (this.tags == null)
      this.tags = new ArrayList<>(); 
    return this.tags;
  }
}
