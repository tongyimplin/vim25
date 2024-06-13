package com.vmware.vim25;

import com.vmware.vim25.PowerOnFtSecondaryTimedout;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Timedout")
@XmlSeeAlso({PowerOnFtSecondaryTimedout.class})
public class Timedout extends VimFault {}
