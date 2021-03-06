package de.persosim.simulator.secstatus;

import java.util.Collection;
import java.util.HashSet;



/**
 * This condition can be used to check for past executions of PACE.
 * @author mboonk
 *
 */
public class PaceSecurityCondition implements SecCondition {
	
	@Override
	public boolean check(Collection<SecMechanism> mechanisms) {
		for (SecMechanism mechanism : mechanisms){
			if (mechanism instanceof PaceMechanism){
				return true;
			}
		}
		return false;
	}

	@Override
	public Collection<Class<? extends SecMechanism>> getNeededMechanisms() {
		HashSet<Class<? extends SecMechanism>> result = new HashSet<>();
		result.add(PaceMechanism.class);
		return result;
	}
}
