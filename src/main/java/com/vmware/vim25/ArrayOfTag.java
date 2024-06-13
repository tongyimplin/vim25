package com.vmware.vim25;

import com.vmware.vim25.ArrayOfTag;
import com.vmware.vim25.Tag;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTag", propOrder = {"tag"})
public class ArrayOfTag {
  @XmlElement(name = "Tag")
  protected List<Tag> tag;
  
  public List<Tag> getTag() {
    if (this.tag == null)
      this.tag = new ArrayList<>(); 
    return this.tag;
  }
}
