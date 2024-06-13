package com.vmware.vim25;

import com.vmware.vim25.BoolOption;
import com.vmware.vim25.ChoiceOption;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.FloatOption;
import com.vmware.vim25.IntOption;
import com.vmware.vim25.LongOption;
import com.vmware.vim25.OptionType;
import com.vmware.vim25.StringOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionType", propOrder = {"valueIsReadonly"})
@XmlSeeAlso({StringOption.class, FloatOption.class, ChoiceOption.class, LongOption.class, IntOption.class, BoolOption.class})
public class OptionType extends DynamicData {
  protected Boolean valueIsReadonly;
  
  public Boolean isValueIsReadonly() {
    return this.valueIsReadonly;
  }
  
  public void setValueIsReadonly(Boolean paramBoolean) {
    this.valueIsReadonly = paramBoolean;
  }
}
