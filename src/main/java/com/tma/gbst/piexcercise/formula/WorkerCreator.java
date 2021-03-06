package com.tma.gbst.piexcercise.formula;

/**
 * This {@code WorkerCreator} interface help to create the next {@link Worker}.
 * 
 * @author tdainhan
 *
 */
public interface WorkerCreator {
	
	/**
	 * Create the next worker.
	 * 
	 * @return Worker
	 */
	public Worker createNextWorker();
	
}
