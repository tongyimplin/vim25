package com.vmware.vim25;

import com.vmware.vim25.ArrayOfProfileExpression;
import com.vmware.vim25.ProfileExpression;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProfileExpression", propOrder = {"profileExpression"})
public class ArrayOfProfileExpression {
  @XmlElement(name = "ProfileExpression")
  protected List<ProfileExpression> profileExpression;
  
  public List<ProfileExpression> getProfileExpression() {
    if (this.profileExpression == null)
      this.profileExpression = new ArrayList<>(); 
    return this.profileExpression;
  }
}
