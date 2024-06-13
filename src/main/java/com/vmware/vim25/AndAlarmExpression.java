package com.vmware.vim25;

import com.vmware.vim25.AlarmExpression;
import com.vmware.vim25.AndAlarmExpression;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AndAlarmExpression", propOrder = {"expression"})
public class AndAlarmExpression extends AlarmExpression {
  @XmlElement(required = true)
  protected List<AlarmExpression> expression;
  
  public List<AlarmExpression> getExpression() {
    if (this.expression == null)
      this.expression = new ArrayList<>(); 
    return this.expression;
  }
}
