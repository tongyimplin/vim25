package com.vmware.vim25;

import com.vmware.vim25.ArrayOfProfilePropertyPath;
import com.vmware.vim25.ProfilePropertyPath;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProfilePropertyPath", propOrder = {"profilePropertyPath"})
public class ArrayOfProfilePropertyPath {
  @XmlElement(name = "ProfilePropertyPath")
  protected List<ProfilePropertyPath> profilePropertyPath;
  
  public List<ProfilePropertyPath> getProfilePropertyPath() {
    if (this.profilePropertyPath == null)
      this.profilePropertyPath = new ArrayList<>(); 
    return this.profilePropertyPath;
  }
}
