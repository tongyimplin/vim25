package com.vmware.vim25;

import com.vmware.vim25.ArrayOfProfileExpressionMetadata;
import com.vmware.vim25.ProfileExpressionMetadata;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProfileExpressionMetadata", propOrder = {"profileExpressionMetadata"})
public class ArrayOfProfileExpressionMetadata {
  @XmlElement(name = "ProfileExpressionMetadata")
  protected List<ProfileExpressionMetadata> profileExpressionMetadata;
  
  public List<ProfileExpressionMetadata> getProfileExpressionMetadata() {
    if (this.profileExpressionMetadata == null)
      this.profileExpressionMetadata = new ArrayList<>(); 
    return this.profileExpressionMetadata;
  }
}
