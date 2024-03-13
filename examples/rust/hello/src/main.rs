use std::thread;
use std::time::Duration;

fn hello() {
    thread::spawn(|| println!("Hello from thread 1"));
    thread::spawn(|| println!("Hello from thread 2"));
}

fn main() {
    println!("====== Hello Threads    =======");
    hello();
    println!("====== Good Bye Threads =======");

    // uncomment me! thread::sleep(Duration::from_secs(1));
}
